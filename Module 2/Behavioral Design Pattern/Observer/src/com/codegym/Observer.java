package com.codegym;

import javax.security.auth.Subject;

abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
