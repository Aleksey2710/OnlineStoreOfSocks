package pro.sky.onlinestoreofsocksapp.services;

import pro.sky.onlinestoreofsocksapp.model.Socks;

/**
 * сервис валидации.
 */
public interface ValidationService {

    /**
     * Валидация сущности Socks
     * @param socks сущность для валидации.
     * @return валидность сущности
     */
    boolean validate(Socks socks);
}
