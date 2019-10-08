import $ from 'jquery';
import Vue from 'vue';
import app from './App.vue';
import router from './router.js';
import VueResource from 'vue-resource' ;
Vue.use(VueResource);
import './list.css';
import 'bootstrap3/dist/css/bootstrap.css';
import './qianduan/css/bootstrap.css';
import './qianduan/css/style.css';
import './qianduan/css/contactstyle.css';
import './qianduan/css/faqstyle.css';
import './qianduan/css/single.css';
import './qianduan/css/medile.css';
import './qianduan/css/jquery.slidey.min.css';
import './qianduan/css/popuo-box.css';
import './qianduan/css/font-awesome.min.css';
import './qianduan/css/owl.carousel.css';
import './qianduan/css/flexslider.css';
import './qianduan/css/news.css';
import carousel from './qianduan/js/owl.carousel.js';
import moveTop from './qianduan/js/move-top.js';
import easing from './qianduan/js/easing.js';
import dotdotdot from './qianduan/js/jquery.dotdotdot.min.js';
import slidey from './qianduan/js/jquery.slidey.js';
import bootstrap  from './qianduan/js/bootstrap.min.js';
import flexslider  from './qianduan/js/jquery.flexslider.js';
import magnific  from './qianduan/js/jquery.magnific-popup.js';
import jquerymin  from './qianduan/js/jquery-2.1.4.min.js';
import simplePlayer  from './qianduan/js/simplePlayer.js';


var App=new Vue({
	el:"#app",
	render(c){
		return c(app);
	},
	router
});