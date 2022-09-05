const http = require('http');
const fs = require('fs')
const server = http.createServer((req, res) => {
    // 파일 전체를 읽어서 응답을 한꺼번에 주기 보다는
    // fs.readFile('file.txt',(err,data)=>{
    //     res.end(data)
    // })
    
    // 스트림 형태로 조금씩 끊어 읽어서 전달해 주는것이 좀더 효율적
    const stream = fs.createReadStream('./file.txt')
    stream.pipe(res)
})

server.listen(5000)