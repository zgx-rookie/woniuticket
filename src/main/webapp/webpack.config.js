const path=require("path");
const {VueLoaderPlugin}=require("vue-loader");

module.exports={
	entry:path.join(__dirname,"./main.js"),
	output:{
		path:path.join(__dirname,"./dist/"),
		filename:"bundle.js"
	},
	resolve:{
		alias:{
			"vue$":"vue/dist/vue.min.js"
		}
	},
	plugins:[
		new VueLoaderPlugin()
	],
	module:{
		rules:[
			{test:/\.css$/,use:["style-loader","css-loader"]},
			{test:/\.vue/,use:["vue-loader"]},
			{test:/\.(png|jpg|pmg|bmp)/,use:["url-loader"]}
		]
	}
}