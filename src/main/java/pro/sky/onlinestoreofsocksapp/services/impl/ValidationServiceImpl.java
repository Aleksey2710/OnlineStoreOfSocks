package pro.sky.onlinestoreofsocksapp.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.onlinestoreofsocksapp.model.Socks;
import pro.sky.onlinestoreofsocksapp.services.ValidationService;

/**
 * Бизнес-логика по работе с валидацией.
 */
@Service
public class ValidationServiceImpl implements ValidationService {

    @Override
    public boolean validate(Socks socks) {
        return socks.getColor()!=null
                && socks.getSize()!=null
                && socks.getCottonPart()>=0 && socks.getCottonPart()<=100
                && socks.getQuantity()>=0;
    }
}
