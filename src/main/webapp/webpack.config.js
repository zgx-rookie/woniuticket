const path =require('path');
const {VueLoaderPlugin} =require('vue-loader');
var webpack =require('webpack');

module.exports={
		entry:path.join(__dirname,'./main.js'),
		output:{
			path:path.join(__dirname,'./dist/'),
			filename:'bundle.js'
		},
		plugins:[
			new VueLoaderPlugin(),
			new webpack.ProvidePlugin({
				$:"jquery",
				jQuery:"jquery",
				jquery:"jquery",
				"window.jQuery":"jquery"
			})
		],
		resolve:{
			alias:{
				"vue$":"vue/dist/vue.min.js"
				
			}
		},
		module:{
			rules:[
				{test:/\.vue$/,use:'vue-loader'},
				{test:/\.css$/,use:['style-loader','css-loader']},
				{test:/\.(jpg|png|mp4|gif)$/,use:'url-loader'},
				{test:/\.(tof|eot|ttf|woff|woff2|svg|)$/,use:'url-loader'}
			]
		}
		
	
		
}
