const path = require('path')

console.log(__dirname)
console.log(__filename)

console.log(path.sep)//경로 구분
console.log(path.delimiter)// 환경 변수 구분

//bashname
console.log(path.basename(__filename))
console.log(path.basename(__filename, '.js')) // 확장자 제거

// dirname
console.log(path.dirname(__filename));

//extension
console.log(path.extname(__filename))

// parse
const parsed = path.parse(__filename)
console.table(parsed)

const str = path.format(parsed)
console.log(str)

//isAbsolute 절대 경로 인지 상대 경로 인지
console.log('isAbsolute?', path.isAbsolute(__dirname))
console.log('isAbsolute?', path.isAbsolute('../'))

// normalize 경로에서 에러가 있다면 알아서 수정해주는 api
console.log(path.normalize('./folder//////sub'))

//join
// 현재 있는 디렉터리에 새로운 폴더에 대한 값을 사용
console.log(`${__dirname}${path.sep}image`)
console.log(path.join(__dirname, 'image'))

