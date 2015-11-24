package com.sunzequn.search.data.crawler.exception;

import java.io.IOException;

/**
 * Created by Sloriac on 15/11/21.
 * <p>
 * Handle exceptions of config files.
 */
public class ConfigException extends IOException {

    public ConfigException() {
        super();
    }

    public ConfigException(String message) {
        super(message);
    }
}
