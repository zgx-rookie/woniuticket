package com.woniuxy.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.woniuxy.domain.Movie;
import com.woniuxy.domain.Page;
import com.woniuxy.service.IMovieService;

@Controller
@RequestMapping("movies")
public class MovieController {

	@Autowired
	private IMovieService service;
	
	
	private String upload(MultipartFile file,HttpServletRequest req) throws IOException {
		String Filename = file.getOriginalFilename();
		String suffix = Filename.substring(Filename.lastIndexOf('.'));
		String newName = UUID.randomUUID().toString()+suffix;
		byte[] bytes = file.getBytes();
		String realPath = req.getServletContext().getRealPath("/upload/");
		OutputStream out=new FileOutputStream(new File(realPath,newName));
		out.write(bytes);
		System.out.println("上传成功");
		out.close();
		return newName;
	}
	
	
	
	//添加
	@PostMapping
	@ResponseBody
	public void save(@RequestBody MultipartFile mposter1,MultipartFile mcover1,MultipartFile mprevue1,Movie movie,HttpServletRequest req) throws IOException {
		if(mposter1!=null) {
			
			movie.setMposter("upload/"+upload(mposter1, req));
		}
		if(mcover1!=null) {
			movie.setMcover("upload/"+upload(mcover1, req));
		}
		if(mprevue1!=null) {
			movie.setMprevue("upload/"+upload(mprevue1, req));
		}
		System.out.println(mposter1+":"+mcover1+":"+mprevue1);
		service.save(movie); 
		
	}
	
	
	//查所有
	@GetMapping
	@ResponseBody
	public List<Movie> findAll(){
		List<Movie> list = service.findAll();
		return list;
	}
	
	
	// 分页搜索
	@GetMapping("limit")
	@ResponseBody
	public Page<Movie> findlimit(String name,String p,String mtype){
		if(name=="") {
			name=null;
		}
		if(mtype=="") {
			mtype=null;
		}
		System.out.println(mtype);
		int pg = Integer.parseInt(p);
		System.out.println(name+"   "+pg);
		Page<Movie> newPage=new Page<Movie>(pg,getRowCount(name,mtype),5);
		
		newPage.setName(name);
		newPage.setMtype(mtype);
		List<Movie> list = service.findlimit(newPage);
		if(list.size()!=0) {
			newPage.setList(list);
		}
		return newPage;
	}
	
	//获取搜索到的行数
	private Integer getRowCount(String name,String mtype) {
		Integer rowCount = service.getRowCount(name,mtype);
		System.out.println(rowCount);
		return rowCount;
	}
	
	
	
	
	//删除   包括文件
	@DeleteMapping
	@ResponseBody
	public void delete(Integer movid,HttpServletRequest req){
		System.out.println(movid);
		delFile(movid,req);
		service.delete(movid);
	}
	
	private void delFile(Integer movid,HttpServletRequest req) {
		Movie m = service.findOne(movid);
		if(m.getMposter()!=null) {
			File f=new File(req.getServletContext().getRealPath("/"),m.getMposter());
			f.delete();
		}
		if(m.getMprevue()!=null) {
			File f2=new File(req.getServletContext().getRealPath("/"),m.getMprevue());
			f2.delete();
		}
		if(m.getMcover()!=null) {
			File f3=new File(req.getServletContext().getRealPath("/"),m.getMcover());
			f3.delete();
		}
		
		
		
	}
	
	//查询一个
	@GetMapping("findOne")
	@ResponseBody
	public Movie findOne(Integer movid){
		Movie movie = service.findOne(movid);
		return movie;
	}
	
	
	//修改  包括文件
	@PutMapping
	@ResponseBody
	public void update(MultipartFile file1,MultipartFile file2,MultipartFile file3,Movie movie,HttpServletRequest req) throws IOException {
		System.out.println(movie);
		delFile(movie.getMovid(), req);
		if(file1!=null) {
			movie.setMposter("upload/"+upload(file1, req));
		}
		if(file2!=null) {
			movie.setMcover("upload/"+upload(file2, req));
		}
		if(file3!=null) {
			movie.setMprevue("upload/"+upload(file2, req));
		}
		service.update(movie);
		
	}
	@GetMapping("gettype")
	@ResponseBody
	public Map<String,List<String>> getType(){
		List<String> type = service.getType();
		Map<String,List<String>> map=new HashMap<>();
		map.put("list", type);
		return map;
	}
	
	
	
}
