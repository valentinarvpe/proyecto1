package org.example.Utils

import org.example.models.Logger

class TimeStampingLogger extends Logger  {
    private Logger logger

    TimeStampingLogger(logger) {
        this.logger = logger
    }
    def log(String message) {
        def now = Calendar.instance
        logger.log("$now.time: $message")
    }
}
