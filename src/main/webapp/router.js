import Vue from 'vue';
import homePage from './homePage.vue';
import VueRouter from 'vue-router';
Vue.use(VueRouter);


var router =new VueRouter({
	routes:[
		{path:'/',component:homePage}
	]
});

export default router;