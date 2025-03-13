const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmmcq7i/",
            name: "ssmmcq7i",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmmcq7i/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家谱管理系统"
        } 
    }
}
export default base
