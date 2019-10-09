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
								  <input type="text" name="Username" placeholder="用户名" required="">
								  <input type="password" name="Password" placeholder="密码" required="">
								  <input type="submit" value="Login">
								</form>
							  </div>
							  <div class="form">
								<h3>注册页</h3>
								<form action="#" method="post">
								  <input type="text" name="Username" placeholder="用户名" required="">
								  <input type="password" name="Password" placeholder="请输入12位英文字母+数字" required="">
								  <input type="email" name="Email" placeholder="邮箱" required="">
								  <input type="text" name="Phone" placeholder="手机号" required="">
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
	
	<div class="header-placeholder"></div>


    <div class="container" id="app" >
   <div class="order-progress-bar">
  <div class="step first done">
    <span class="step-num">1</span>
    <div class="bar"></div>
    <span class="step-text">选择影片场次</span>
  </div>
  <div class="step done">
    <span class="step-num">2</span>
    <div class="bar"></div>    
    <span class="step-text">选择座位</span>    
  </div>
  <div class="step ">
    <span class="step-num">3</span>
    <div class="bar"></div>    
    <span class="step-text">14分钟内付款</span>    
  </div>
  <div class="step last ">
    <span class="step-num">4</span>
    <div class="bar"></div>    
    <span class="step-text">影院取票观影</span>    
  </div>
</div>
    
    </div>
    
    <div class="main clearfix"  style="margin-left:200px">
      <div class="hall">
        <div class="seat-example">
          <div class="selectable-example example">
            <span>可选座位</span>
          </div>
          <div class="sold-example example">
            <span>已售座位</span>
          </div>
          <div class="selected-example example">
            <span>已选座位</span>
          </div>
          <div class="couple-example example">
            <span>情侣座位</span>
          </div>
        </div>
        </div>
    
    
    
    <!--座位布局 -->
    <div class="seats-block" data-cols="11" data-section-id="17117" data-section-name="默认场区" data-seq-no="201910040383181" style="margin-left:200px">
 	 <div class="row-id-container">
        <span class="row-id">1</span>    
        <span class="row-id">2</span>    
        <span class="row-id">3</span>    
        <span class="row-id">4</span>    
        <span class="row-id">5</span>    
  	</div>
  	
  	<div class="seats-container">
    <div class="screen-container">
      <div class="screen">银幕中央</div>
      <div class="c-screen-line"></div>
    </div>

    <div class="seats-wrapper" style="margin-left:40px">
        <div class="row">
            <span class="seat selectable" 
              data-column-id="1"
              data-row-id="1"
              data-no="000000017117-1-1"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="2"
              data-row-id="1"
              data-no="000000017117-1-2"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="3"
              data-row-id="1"
              data-no="000000017117-1-3"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="4"
              data-row-id="1"
              data-no="000000017117-1-4"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="5"
              data-row-id="1"
              data-no="000000017117-1-5"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="6"
              data-row-id="1"
              data-no="000000017117-1-6"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="7"
              data-row-id="1"
              data-no="000000017117-1-7"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="8"
              data-row-id="1"
              data-no="000000017117-1-8"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="9"
              data-row-id="1"
              data-no="000000017117-1-9"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="10"
              data-row-id="1"
              data-no="00000017117-1-10"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="1"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
        </div>
        <div class="row">
            <span class="seat empty" 
              data-column-id=""
              data-row-id="2"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="1"
              data-row-id="2"
              data-no="000000017117-2-2"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="2"
              data-row-id="2"
              data-no="000000017117-2-3"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="3"
              data-row-id="2"
              data-no="000000017117-2-4"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="4"
              data-row-id="2"
              data-no="000000017117-2-5"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="5"
              data-row-id="2"
              data-no="000000017117-2-6"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="6"
              data-row-id="2"
              data-no="000000017117-2-7"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="7"
              data-row-id="2"
              data-no="000000017117-2-8"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="8"
              data-row-id="2"
              data-no="000000017117-2-9"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="9"
              data-row-id="2"
              data-no="00000017117-2-10"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="10"
              data-row-id="2"
              data-no="00000017117-2-11"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
        </div>
        <div class="row">
            <span class="seat empty" 
              data-column-id=""
              data-row-id="3"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="3"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="1"
              data-row-id="3"
              data-no="000000017117-3-3"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="2"
              data-row-id="3"
              data-no="000000017117-3-4"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="3"
              data-row-id="3"
              data-no="000000017117-3-5"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="4"
              data-row-id="3"
              data-no="000000017117-3-6"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="5"
              data-row-id="3"
              data-no="000000017117-3-7"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="6"
              data-row-id="3"
              data-no="000000017117-3-8"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="7"
              data-row-id="3"
              data-no="000000017117-3-9"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="3"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="3"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
        </div>
        <div class="row">
            <span class="seat empty" 
              data-column-id=""
              data-row-id="4"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="4"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="1"
              data-row-id="4"
              data-no="000000017117-4-3"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="2"
              data-row-id="4"
              data-no="000000017117-4-4"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat sold" 
              data-column-id="3"
              data-row-id="4"
              data-no="000000017117-4-5"
              data-st="LK"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat sold" 
              data-column-id="4"
              data-row-id="4"
              data-no="000000017117-4-6"
              data-st="LK"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="5"
              data-row-id="4"
              data-no="000000017117-4-7"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="6"
              data-row-id="4"
              data-no="000000017117-4-8"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="7"
              data-row-id="4"
              data-no="000000017117-4-9"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="8"
              data-row-id="4"
              data-no="00000017117-4-10"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="4"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
        </div>
        <div class="row">
            <span class="seat empty" 
              data-column-id=""
              data-row-id="5"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="1"
              data-row-id="5"
              data-no="000000017117-5-2"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="2"
              data-row-id="5"
              data-no="000000017117-5-3"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat sold" 
              data-column-id="3"
              data-row-id="5"
              data-no="000000017117-5-4"
              data-st="LK"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat sold" 
              data-column-id="4"
              data-row-id="5"
              data-no="000000017117-5-5"
              data-st="LK"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat sold" 
              data-column-id="5"
              data-row-id="5"
              data-no="000000017117-5-6"
              data-st="LK"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat sold" 
              data-column-id="6"
              data-row-id="5"
              data-no="000000017117-5-7"
              data-st="LK"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="7"
              data-row-id="5"
              data-no="000000017117-5-8"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="8"
              data-row-id="5"
              data-no="000000017117-5-9"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat selectable" 
              data-column-id="9"
              data-row-id="5"
              data-no="00000017117-5-10"
              data-st="N"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
            <span class="seat empty" 
              data-column-id=""
              data-row-id="5"
              data-no=""
              data-st="E"
              data-act="seat-click"
              data-bid="b_s7eiiijf"
            ></span>
        </div>
        
    </div>
    <div class="side">
        <div class="movie-info clearfix">
          <div class="poster">
            <img src="https://p0.meituan.net/movie/4c01895cfd53e82f7c3048c407974a6b4739229.jpg@115w_158h_1e_1c">
          </div>
          <div class="content">
            <p class="name text-ellipsis">攀登者</p>
            <div class="info-item">
              <span>类型 :</span>
              <span class="value">剧情,冒险</span>
            </div>
            <div class="info-item">
              <span>时长 :</span>
              <span class="value">125分钟</span>
            </div>
          </div>
        </div>

        <div class="show-info">
          <div class="info-item">
            <span>影院 :</span>
            <span class="value text-ellipsis">金逸影城（西安澳堡店）</span>
          </div>
          <div class="info-item">
            <span>影厅 :</span>
            <span class="value text-ellipsis">2号厅（前台办卡购票19.9）</span>
          </div>
          <div class="info-item">
            <span>版本 :</span>
            <span class="value text-ellipsis">国语2D</span>
          </div>
          <div class="info-item">
            <span>场次 :</span>
            <span class="value text-ellipsis screen">今天 10月4 17:10</span>
          </div>
          <div class="info-item">
            <span>票价 :</span>
            <span class="value text-ellipsis">￥34/张</span>
          </div>
        </div>

        <div class="ticket-info">
          <div class="no-ticket">
            <p class="buy-limit">座位：一次最多选6个座位</p>
            <p class="no-selected">请<span>点击左侧</span>座位图选择座位</p>
          </div>
          <div class="has-ticket" style="display:none">
            <span class="text">座位：</span>
            <div class="ticket-container" data-limit="6"></div>
          </div>

          <div class="total-price">
            <span>总价 :</span>
            <span class="price">0</span>
          </div>
        </div>

        <div class="confirm-order">
            <div id="iLoginComp"></div>

        </div>
      </div>
  </div>
    </div>
    
    </div>
	
	
	
	
</div>

	
</div>
</template>

<style scoped>
	div{
		width:"80px";
		background-color:white	
	}

</style>

<script>	
	$(function(){
		
	})
	export default {
		data(){
			return {
			
			}
			
		},
		methods:{
			a(){
			alert(999);
			}
		}
	
	}
</script>