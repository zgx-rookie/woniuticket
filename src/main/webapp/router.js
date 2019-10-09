import Vue from 'vue';
import login from './login.vue';
import VueRouter from 'vue-router';
Vue.use(VueRouter);


var router =new VueRouter({
	routes:[
		{path:'/login',component:login}
	]
});

export default router;