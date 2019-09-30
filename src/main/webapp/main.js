import Vue from "vue";
import router from "./router.js";
import app from "./vue/app.vue"


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