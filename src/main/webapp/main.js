import Vue from "vue";
import router from "./router.js";
import film from "./vue/film.vue";
import movie from "./vue/movie.vue";
import seats from "./vue/seats.vue";
import app from "./vue/App.vue";
import $ from "jquery";
import "bootstrap/dist/css/bootstrap.min.css";
import "./front/css/bootstrap.css";
import "./front/css/contactstyle.css";
import "./front/css/faqstyle.css";
import "./front/css/flexslider.css";
import "./front/css/font-awesome.min.css";
import "./front/css/jquery.slidey.min.css";
import "./front/css/medile.css";
import "./front/css/news.css";
import "./front/css/owl.carousel.css";
import "./front/css/popuo-box.css";
import "./front/css/single.css";
import "./front/css/style.css";
import "./front/css/theatre1.css";
import "./front/css/theatre2.css";
import "./front/css/theatre3.css";
import "./front/css/theatre4.css";

var vue=new Vue({
	el:"#app",
	data:{
		msg:"你快乐吗"
	},
	render(c){
		return c(app)
	},
	router
})