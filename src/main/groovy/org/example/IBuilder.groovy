package org.example

import java.security.PublicKey

interface IBuilder<T> {
    def T build()
}