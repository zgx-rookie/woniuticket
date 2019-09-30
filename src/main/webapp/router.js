import Vue from "vue";
import a from "./vue/a.vue";
import b from "./vue/b.vue";
import VueRouter from "vue-router";
Vue.use(VueRouter);

var router=new VueRouter({
	routes:[
		{path:"/a",component:a},
		{path:"/b",component:b}
	]
	
})

export default router