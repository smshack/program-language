const fs = require('fs')

// 지금 사용하고 있는 메모리를 저장
const beforeMem = process.memoryUsage().rss;
// 해당 데이터를 읽어서
// 메모리가 얼마나 큰지  메모리를 출력한다
// 스트림을 사용하면 버퍼로 나눠서
// 순차적으로 읽고 쓰고 읽고 쓰고를 할수 있음
fs.readFile('./file.txt', (_, data) => {
    fs.writeFile('./file2.txt', data, () => { })
    // calculate
    const afterMem = process.memoryUsage().rss;
    const diff = afterMem - beforeMem;
    const consumed = diff / 1024 / 1024
    console.log(diff)
    console.log(`Consumed Memory:${consumed}MB`)
})