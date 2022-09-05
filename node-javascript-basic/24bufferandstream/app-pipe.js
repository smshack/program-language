const fs = require('fs')
const zlib = require('zlib')

const writeStream = fs.createWriteStream('./file4.zip')
const zlibStream = zlib.createGzip()
const readStrean = fs.createReadStream('./file.txt')
// 읽기 스트림을 파이프로 쓰기 스트림으로 바로 연결 시킬수 있음
// 파일을 스트림으로 읽고 압축해서 쓴다
const piping = readStrean.pipe(zlibStream).pipe(writeStream)

piping.on('finish', () => {
    console.log('done!!!')
})