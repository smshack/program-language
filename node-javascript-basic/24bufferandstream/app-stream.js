const fs = require('fs')

// 해당 파일을 몇바이트로 끊어서 읽어오는지 8bit 만큼 끊어서 utf-8로 읽어 준다.

const readStrean = fs.createReadStream('./file.txt', {
    highWaterMark: 1024, //8bit
    encoding: 'utf-8',
})

const data = []
// 스트림을 사용하여 데이터를 순차적으로 조금씩 사용할 수 있다
readStrean.on('data', chunk => {
    data.push(chunk)
    console.count('data')
})

readStrean.on('error', error => console.log)

readStrean.on('end', () => {
    console.log(data.join(''))
})