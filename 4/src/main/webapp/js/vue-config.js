const path = require('path')
function resolve(dir) {
    return path.join(__dirname, dir)
}
module.exports = {
//路径根据自己的情况定，默认就填"./",静态资源的路径在static文件夹下就写’./static’
    publicPath: './webapp',
//配置服务器,自动打开页面
    devServer: {
        open: true
    },
    configureWebpack: {
        resolve: {
            alias: {
                '@': resolve('src')
            }
        }
    }
}
