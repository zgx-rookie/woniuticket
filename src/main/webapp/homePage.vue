<template>
	<div >
	
		<div class="Latest-tv-series">
		<h4 class="latest-text w3_latest_text w3_home_popular">精彩预告</h4>
		<div class="container">
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li  v-for="movie in movieList">
							<div class="agile_tv_series_grid" >
								<div class="col-md-6 agile_tv_series_grid_left">
									<div class="w3ls_market_video_grid1">
										<img :src=movie.mcover alt=" " class="img-responsive" />
										<a class="w3_play_icon" href="#small-dialog">
											<span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
										</a>
									</div>
								</div>
								<div class="col-md-6 agile_tv_series_grid_right">
									<p class="fexi_header">电影名</p>
									<p class="fexi_header_para"><span class="conjuring_w3">电影简介<label>:</label></span>{{movie.minfo}}</p>
									<p class="fexi_header_para"><span>上映时间<label>:</label></span>{{movie.mshowtime}}</p>
									<p class="fexi_header_para">
										<span>类型<label>:</label> </span>
										<a href="genres.html">{{movie.mtype}}</a>
															
									</p>
									<p class="fexi_header_para fexi_header_para1"><span>Star Rating<label>:</label></span>
										<a href="#"><i class="fa fa-star" aria-hidden="true"></i></a>
										<a href="#"><i class="fa fa-star" aria-hidden="true"></i></a>
										<a href="#"><i class="fa fa-star-half-o" aria-hidden="true"></i></a>
										<a href="#"><i class="fa fa-star-o" aria-hidden="true"></i></a>
										<a href="#"><i class="fa fa-star-o" aria-hidden="true"></i></a>
									</p>
								</div>
								<div class="clearfix"> </div>
							</div>
						</li>
					</ul>
				</div>
			</section>
		</div>
	</div>
		
		
		
		
    	
		<div class="general">
		<h4 class="latest-text w3_latest_text">正在热映</h4>
		<div class="container">
			<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
				<ul id="myTab" class="nav nav-tabs" role="tablist">
					<li v-for="i in type" role="presentation" class="active" ><a href="#home" @click="mtype(i)" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true" >{{i}}</a></li>
				</ul>
				<div id="myTabContent" class="tab-content">
					<div role="tabpanel" class="tab-pane fade active in" aria-labelledby="home-tab" v-for="movie in typeList">
						<div class="w3_agile_featured_movies">
							<div class="col-md-2 w3l-movie-gride-agile">
								<a href="single.html" class="hvr-shutter-out-horizontal"><img :src=movie.mprevue title="album-name" class="img-responsive" alt=" " />
									<div class="w3l-action-icon"><i class="fa fa-play-circle" aria-hidden="true"></i></div>
								</a>
								<div class="mid-1 agileits_w3layouts_mid_1_home">
									<div class="w3l-movie-text">
										<h6><a href="single.html">{{movie.mname}}</a></h6>							
									</div>
									<div class="mid-2 agile_mid_2_home">
										
										<div class="block-stars">
											<ul class="w3l-ratings">
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star-half-o" aria-hidden="true"></i></a></li>
											</ul>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
								
							</div>
						</div>
					</div>
					</div>
				</div>
			</div>
		</div>
		
		
		
	
	
		<div class="general">
		<h4 class="latest-text w3_latest_text">即将上映</h4>
		<div class="container">
			<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
				<div id="myTabContent" class="tab-content">
					<div role="tabpanel" class="tab-pane fade active in" aria-labelledby="home-tab" v-for="movie in movieList">
						<div class="w3_agile_featured_movies">
							<div class="col-md-2 w3l-movie-gride-agile">
								<a href="single.html" class="hvr-shutter-out-horizontal"><img :src=movie.mprevue title="album-name" class="img-responsive" alt=" " />
									<div class="w3l-action-icon"><i class="fa fa-play-circle" aria-hidden="true"></i></div>
								</a>
								<div class="mid-1 agileits_w3layouts_mid_1_home">
									<div class="w3l-movie-text">
										<h6><a href="single.html">{{movie.mname}}</a></h6>							
									</div>
									<div class="mid-2 agile_mid_2_home">
										
										<div class="block-stars">
											<ul class="w3l-ratings">
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
												<li><a href="#"><i class="fa fa-star-half-o" aria-hidden="true"></i></a></li>
											</ul>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
								
							</div>
						</div>
					</div>
					</div>
				</div>
			</div>
		</div>
    	
	 
		
		
	</div>
</template>


<script>
	
	$(document).ready(function(){
		$("#owl-demo").owlCarousel({
		  autoPlay: 3000,
		  items : 5,
		  itemsDesktop : [640,4],
		  itemsDesktopSmall : [414,3]
		});
	});
	
	$(document).ready(function(){
		$('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		});
	});
	
	
	export default{
		data(){
			return {
				movieList:[],
				type:[],
				typeList:[]
				
				
			}
		},
		created(){
			this.findAll();
			this.getType();
			this.mtype("jt");
			
		},
		methods:{
			findAll(){
				this.$http.get("http://localhost/movies").then(function(data){
					this.movieList=(data.body);
				});
			},
			getType(){
				this.$http.get("http://localhost/movies/gettype").then(function(data){
					this.type=(data.body.list);
				});
			},
			mtype(type){
				this.$http.get("http://localhost/movies/mtype?mtype="+type).then(function(data){
					this.typeList=(data.body.list);
					
				});
			}
		}
		
	}

</script>