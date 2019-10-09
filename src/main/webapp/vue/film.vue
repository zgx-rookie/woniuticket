<template>

	<div>
	
		<div class="header">
		<div class="container">
			<div class="w3layouts_logo">
				<a href="index.html"><h1>蜗牛<span>Movies</span></h1></a>
			</div>
			<div class="w3_search">
				<form action="#" method="post">
					<input type="text" name="Search" placeholder="Search" required="">
					<input type="submit" value="Go">
				</form>
			</div>
			<div class="w3l_sign_in_register">
				<ul>
					<li><i class="fa fa-phone" aria-hidden="true"></i> (+000) 123 345 653</li>
					<li><a href="#" data-toggle="modal" data-target="#myModal">Login</a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	
	
	<!--影片 -->
	<div class="header-placeholder"></div>

    <div class="banner">
    <div class="wrapper " style="background: transparent;">
      <div class="celeInfo-left" style="background: transparent;">
        <div class="avatar-shadow" style="background: transparent;">
          <img class="avatar" src="https://p0.meituan.net/moviemachine/b2c5c74d33e45745fd3462e44b3698e18336620.jpg@464w_644h_1e_1c" alt="">
            <div class="movie-ver" style="background: transparent;"><i class="imax2d"></i></div>
        </div>
      </div>
      <div class="celeInfo-right clearfix" style="background: transparent; ">
            <div class="movie-brief-container"  style="background: transparent; margin-top:60px">
      <h3 class="name" >中国机长</h3>
      <div class="ename ellipsis" style="background: transparent;">The Captain</div>
      <ul>
        <li class="ellipsis">剧情,传记</li>
        <li class="ellipsis">
        中国大陆
          / 111分钟
        </li>
        <li class="ellipsis">2019-09-30 09:00大陆上映</li>
      </ul>
    </div>
    <div class="action-buyBtn" style="background: transparent;">
      <div class="action clearfix" data-val="{movieid:1230121}" style="background: transparent;">
        <a class="wish " data-wish="false" data-score="" data-bid="b_gbxqtw6x">
          <div style="background: transparent;">
            <i class="icon wish-icon"></i>
              <span class="wish-msg" data-act="wish-click">想看</span>
          </div>
        </a>
        <a class="score-btn " data-bid="b_rxxpcgwd">
          <div style="background: transparent;">
            <i class="icon score-btn-icon"></i>
            <span class="score-btn-msg" data-act="comment-open-click">
                评分
            </span>
          </div>
        </a>
      </div>
        <a class="btn buy" href="/films/1230121" target="_blank" data-act="more-detail-click" data-bid="b_ozuzh4j4">查看更多电影详情</a>
    </div>

    <div class="movie-stats-container" style="background: transparent;">

        <div class="movie-index" style="background: transparent;">
          <p class="movie-index-title">想看数</p>
          <div class="movie-index-content score normal-score" style="background: transparent;">
              <span class="index-left info-num one-line"><span class="stonefont">130000000</span></span>
          </div>
        </div>

        

        <div class="movie-index" style="background: transparent;">
          <p class="movie-index-title" style="background: transparent;">累计票房</p>
          <div class="movie-index-content box" style="background: transparent;">
              <span class="stonefont">1233</span><span class="unit">万</span>
          </div>
        </div>
    </div>

      </div>
    </div>
</div>

<!--影院列表 -->

	<div class="cinemas-list" style="margin-left:200px" id="film">
    <h2 class="cinemas-list-header">影院列表</h2>
    
      <div class="cinema-cell">
        <div class="cinema-info">
          <a href="/cinema/16621?poi=118740119&amp;movieId=1230121" class="cinema-name" data-act="cinema-name-click" data-bid="b_wek7vrx9" data-val="{city_id: 42, cinema_id: 16621}">香港未来主题影院</a>
          <p class="cinema-address">地址：碑林区长安立交东北角香港未来影院二楼</p>
        </div>

        <div class="buy-btn"  >
          <a href="/cinema/16621?poi=118740119&amp;movieId=1230121" @click.prevent="a"  data-act="buy-btn-click" data-val="{city_id: 42, cinema_id: 16621}" data-bid="b_wek7vrx9">选座购票</a>
        </div>
        
        <div class="price">
            <span class="rmb red">￥</span>
            <span class="price-num red"><span class="stonefont">&#xf533;&#xe9fa;</span></span>
            <span>起</span>
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
			this.$router.push({path:"/movie"});
			}
		}
	
	
	
	
	
	
	
	
	}
</script>