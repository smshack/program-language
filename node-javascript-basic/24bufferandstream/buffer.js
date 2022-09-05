const buf = Buffer.from('hi')
console.log(buf); // 유니코드 형태로 출력
console.log(buf.length)
console.log(buf[0]) // 아스키 코드 형태로 출력됨
console.log(buf[1])
console.log(buf.toString())// 문자열로 변환해서 출력 가능 기본값은 utf-8

//create
const buf2 = Buffer.alloc(2); // 이쪽이 더 좋음
buf2[0] = 72;
buf2[1] = 105;
const buf3 = Buffer.allocUnsafe(2);// fast 빠르지만 위험함
buf2.copy(buf3)
console.log(buf2)
console.log(buf3)

const newBuf = Buffer.concat([buf, buf2, buf3])
console.log(newBuf.toString())