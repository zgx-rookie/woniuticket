<template>

	<div>
		<form>
	用户名:<input name="username" v-model="username"><br>
	密码:<input name="password" v-model="password"><br>
	<button type="button" @click="log()">登录</button>
	
	</form>

	</div>

</template>

<style scoped>

</style>

<script>
 export default{
 	data(){
 		return {
 				username:"",
 				password:""
 		};
 	
 	},
 	methods:{
 		log(){
 		alert(111);
 		}
 	
 	}
 
 }
</script>