package proyecto.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author jose
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    
}
