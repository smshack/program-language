const EventEmitter = require('events')

const emitter = new EventEmitter();

const callback1 = (args) => {
    console.log('first callback - ', args)
}
// 이벤트 이미터
// jarry 라는 이벤트가 발생하면 callback 함수를 실행하라고 등록1
emitter.on('jarry', callback1)

// 등록2
emitter.on('jarry', (args) => {
    console.log('second callback - ', args)
})

emitter.emit('jarry', { message: 1 })
emitter.emit('jarry', { message: 2 })
emitter.removeAllListeners();
emitter.emit('jarry', { message: 3 })