package com.woniuxy.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.Page;
import com.woniuxy.domain.Picture;
import com.woniuxy.service.ICinemaService;
import com.woniuxy.service.IPictureService;

@Controller
@RequestMapping("cinemas")
public class CinemaController {
	
	@Autowired
	ICinemaService service;
	
	@PostMapping  
	@ResponseBody
	public void save(@RequestBody MultipartFile logo,MultipartFile pinfo,Cinema cinema,HttpServletRequest req) throws IOException, InterruptedException {
		
		String realPath=req.getServletContext().getRealPath("/");
		
		UUID uuid = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();
		String temp = logo.getOriginalFilename();
		String temp2 = pinfo.getOriginalFilename();
		
		//logo和pinfo的相对路径
		String str="logo/"+uuid+temp.substring(temp.lastIndexOf("."));
		String str2="picture/"+uuid2+temp2.substring(temp2.lastIndexOf("."));
		
		//logo和pinfo的绝对路径
		String logoStr=realPath+str;
		String pinfoStr=realPath+str2;
		
		System.out.println(logoStr);
		System.out.println(pinfoStr);
		//如果没有dir路径就创建
		File dir=new File(realPath+"logo");
		if(!dir.exists())dir.mkdirs();
		
		logo.transferTo(new File(logoStr));
		pinfo.transferTo(new File(pinfoStr));
		cinema.setClogo(str);
		cinema.setCpicture(str2);
		service.save(cinema);
		
	}
	
//	@GetMapping
//	@ResponseBody
//	public List<Cinema> findAll(){
//		List<Cinema> findAll = service.findAll(null);
//		for (Cinema cinema : findAll) {
//			System.out.println(cinema);
//		}
//		return findAll;   
//	}
	
	
	@GetMapping
	@ResponseBody
	public Page<Cinema> findByPage(@RequestParam Integer page,String cname){
		System.out.println(page+"   "+cname);
		Cinema cinema=new Cinema();
		cinema.setCname(cname);
		Page<Cinema> p = service.findByPage(cinema,page,5);
		List<Cinema> list = p.getList();
		for (Cinema cinema2 : list) {
			System.out.println(cinema2);
		}
		
		return p;   
	}
	
	
	@DeleteMapping
	@ResponseBody
	public void delete(@RequestBody Cinema cinema, HttpServletRequest req) {
		String realPath=req.getServletContext().getRealPath("/");
		Integer cid = cinema.getCid();
		System.out.println(cid);
		Cinema c=service.findOne(cid);
	
		System.out.println(c);
		String pinfo = c.getCpicture();
		String clogo=c.getClogo();
		
		//pinfo和clogo 所在的位置
		String pinfoStr=realPath+pinfo;
		String clogoStr=realPath+clogo;
		
		File pFile=new File(pinfoStr);
		File cFile=new File(clogoStr);
		System.out.println(pFile+"        "+cFile);
		boolean f1 = pFile.delete();
		boolean f2 = cFile.delete();
		System.out.println(f1+"      "+f2);
		service.delete(cid);
	}
	@PutMapping
	@ResponseBody
	public void updata(@RequestBody MultipartFile logo,MultipartFile picture,Cinema cinema,HttpServletRequest req) throws IllegalStateException, IOException {
		String realPath=req.getServletContext().getRealPath("/");
		Cinema findOne = service.findOne(cinema.getCid());
		String clogo = findOne.getClogo();
		String cpicture = findOne.getCpicture();
		File logoFile=new File(realPath+clogo);
		File pictureFile=new File(realPath+cpicture);
		logoFile.delete();
		pictureFile.delete();
		System.out.println(clogo+"        "+cpicture);
		UUID logoUUId=UUID.randomUUID();
		UUID pictureUUId=UUID.randomUUID();
		
		String logoTemp=logo.getOriginalFilename();
		String picTemp=picture.getOriginalFilename();
		String logoStr="logo/"+logoUUId+logoTemp.substring( logoTemp.lastIndexOf("."));
		String picStr="logo/"+pictureUUId+picTemp.substring( picTemp.lastIndexOf("."));
		
		//如果没有dir路径就创建
		File dir=new File(realPath+"logo");
		if(!dir.exists())dir.mkdirs();
		System.out.println(realPath);
		
		logo.transferTo(new File(realPath+logoStr));
		picture.transferTo(new File(realPath+picStr));
		
		cinema.setClogo(logoStr);
		cinema.setCpicture(picStr);
		service.Update(cinema); 
	}
	  
	
}
