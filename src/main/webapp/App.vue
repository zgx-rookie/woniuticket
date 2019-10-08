<template>
<div>
	<div class="header">
		<div class="container">
			<div class="w3layouts_logo">
				<a href="index.html"><h1>蜗牛<span>影院</span></h1></a>
			</div>
			<div class="w3_search">
				<form action="#" method="post">
					<input type="text" name="Search" placeholder="Search" required="">
					<input type="submit" value="Go">
				</form>
			</div>
			<div class="w3l_sign_in_register">
				<ul>
					<li><i class="fa fa-phone" aria-hidden="true"></i> 88888888</li>
					<li><a href="#" data-toggle="modal" data-target="#myModal">登陆</a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					登陆&注册
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
				<section>
					<div class="modal-body">
						<div class="w3_login_module">
							<div class="module form-module">
							  <div class="toggle"><i class="fa fa-times fa-pencil"></i>
								<div class="tooltip">切换</div>
							  </div>
							  <div class="form">
								<h3>登陆页</h3>
								<form action="#" method="post">
								  <input type="text" name="username" v-model="username" placeholder="用户名" required="">
								  <input type="password" name="password" v-model="password" placeholder="密码" required="">
								  <input type="password" name="password" v-model="verifiy" placeholder="密码" required="">
								  <img src="" />
								  <input type="submit" value="Login">
								</form>
							  </div>
							  <div class="form">
								<h3>注册页</h3>
								<form action="#" method="post">
								  <input type="text" name="Username" placeholder="用户名" required="">
								  <input type="password" name="Password" placeholder="请输入12位英文字母+数字" required="">
								  <input type="text" name="Phone" placeholder="手机号" required="">
								  <button type="button"  >获取验证码</button>
								  <input type="submit" value="Register">
								</form>
							  </div>
							  <div class="cta"><a href="#">忘记密码</a></div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</div>
	</div>
		
	<div class="movies_nav">
		<div class="container">
			<nav class="navbar navbar-default">
				<div class="navbar-header navbar-left">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
					<nav>
						<ul class="nav navbar-nav">
							<li class="active"><a href="index.html">首页</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">分类 <b class="caret"></b></a>
								<ul class="dropdown-menu multi-column columns-3">
									<li>
									<div class="col-sm-4">
										<ul class="multi-column-dropdown">
											<li><a href="genres.html">动作</a></li>
											<li><a href="genres.html">喜剧</a></li>
											<li><a href="genres.html">恐怖</a></li>
											<li><a href="genres.html">爱情</a></li>
											<li><a href="horror.html">伦理</a></li>
											<li><a href="genres.html">悬疑</a></li>
											<li><a href="genres.html">动画</a></li>
											<li><a href="genres.html">武侠</a></li>
											<li><a href="genres.html">科幻</a></li>
										</ul>
									</div>
									
									
									<div class="clearfix"></div>
									</li>
								</ul>
							</li>
							<li><a href="series.html">地区</a></li>
							<li><a href="news.html">榜单</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">影院 <b class="caret"></b></a>
								<ul class="dropdown-menu multi-column columns-3">
									<li>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<li><a href="genres.html">万达</a></li>
												<li><a href="genres.html">3dmix</a></li>
												<li><a href="genres.html">ss</a></li>
												<li><a href="genres.html">United States</a></li>
											</ul>
										</div>
										
										<div class="clearfix"></div>
									</li>
								</ul>
							</li>
							
							<li><a href="list.html">排序</a></li>
						</ul>
					</nav>
				</div>
			</nav>	
		</div>
	</div>
	
	<div class="general_social_icons">
	<nav class="social">
	<ul>
		<li class="w3_twitter"><a href="#">微信 <i class="fa fa-twitter"></i></a></li>
		<li class="w3_facebook"><a href="#">微博 <i class="fa fa-facebook"></i></a></li>
		<li class="w3_dribbble"><a href="#">快手<i class="fa fa-dribbble"></i></a></li>
		<li class="w3_g_plus"><a href="#">QQ空间<i class="fa fa-google-plus"></i></a></li>				  
	</ul>
	</nav>
	</div>
	
	<router-view></router-view>
	
	
	
	<div class="footer">
		<div class="container">
			<div class="w3ls_footer_grid">
				<div class="col-md-6 w3ls_footer_grid_left">
					<div class="w3ls_footer_grid_left1">
						<h2>搜寻</h2>
						<div class="w3ls_footer_grid_left1_pos">
							<form action="#" method="post">
								<input type="email" name="email" placeholder="请输入内容" required="">
								<input type="submit" value="GO###">
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-6 w3ls_footer_grid_right">
					<a href="index.html"><h2>蜗牛<span>Movies</span></h2></a>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="col-md-5 w3ls_footer_grid1_left">
				<p>版权信息<a href="http://www.cssmoban.com/" target="_blank" title="蜗牛影院">蜗牛</a> - Collect from <a href="http://www.cssmoban.com/" title="平台" target="_blank">加盟</a></p>
			</div>
			<div class="col-md-7 w3ls_footer_grid1_right">
				<ul>
					<li>
						<a href="genres.html">分享</a>
					</li>
					
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	
	
</div>
</template>

<script>

		
			
			
			
	$(document).ready(function() {
		
		$('.toggle').click(function(){
		  $(this).children('i').toggleClass('fa-pencil');
		  $('.form').animate({
			height: "toggle",
			'padding-top': 'toggle',
			'padding-bottom': 'toggle',
			opacity: "toggle"
		  }, "slow");
		});

	
	}); 
	
	export default{
		data(){
			return {
				username:'',
				password:'',
				duanxin:'',
				verification:'',
				verifiy:'',
				sms:'',
				sms2:''
			}
		},
		created(){
			
		},
		methods:{
			login(){
				if(this.verifiy==this.verification){
					this.$http.get("localhost/user/login?username="+this.username+"&password="+"this.password").then(function(data){
						if(data.xxxx==200){
							alert("登录成功");
						}
					})
				}
			},
			register(){
				if(this.sms==this.sms2){
					this.$http.get("localhost/user/register?username="+this.username+"&password="+"this.password").then(function(data){
						if(data.xxxx==200){
							alert("登录成功");
						}
					})
				}
			}
			
			
		}
		
		
    
	
	}
</script>