package com.mercadopago.core.annotations.idempotent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mercado Pago SDK
 * Annotation to mark class as idempotent resource
 *
 * Created by Eduardo Paoletta on 11/30/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Idempotent {

}
