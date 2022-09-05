const EventEmitter = require('events')

// 이벤트 이미터를 상속 해서 해당 클래스 자체를 이벤트 등록할 수 있도록 사용

class Logger extends EventEmitter {
    log(callback) {
        this.emit('log', 'started...');
        callback();
        this.emit('log', 'end!')
    }
}


module.exports.Logger = Logger;