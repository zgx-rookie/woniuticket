const path=require("path");
const {VueLoaderPlugin}=require("vue-loader");
const webpack=require("webpack");
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
		new VueLoaderPlugin(),
		new webpack.ProvidePlugin({
			$:"jquery",
			jQuery:"jquery",
			"Window.jQuery":"jquery"
		})
	],
	module:{
		rules:[
			{test:/\.css$/,use:["style-loader","css-loader"]},
			{test:/\.vue/,use:["vue-loader"]},
			{test:/\.(png|jpg|pmg|bmp|svg|ttf|woff|woff2|eot)/,use:["url-loader"]},
		]
	}
}