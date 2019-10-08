import Vue from "vue";
import a from "./vue/a.vue";
import b from "./vue/b.vue";
import movie from "./vue/movie.vue";
import film from "./vue/film.vue";
import seats from "./vue/seats.vue";
import VueRouter from "vue-router";
Vue.use(VueRouter);

var router=new VueRouter({
	routes:[
		{path:"/movie",component:movie},
		{path:"/seats",component:seats},
		{path:"/film",component:film}
	]
	
})

export default router