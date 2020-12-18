package com.example.demo.model.mapper;

import java.util.List;

/**
 * Facade for transformation between DB models and front-end
 */
public interface MapperFacade {

    /**
     * Transformation of sourceObject to the an example of destinationClass
     *
     * @param sourceObject     initial object
     * @param destinationClass the class to transform the object to
     * @param <S>              initial object type
     * @param <D>              object type, to transform the initial object to
     * @return an example of class D with data from sourceObject
     */
    <S, D> D map(S sourceObject, Class<D> destinationClass);

    /**
     * Writing of data from sourceObject to destinationObject
     *
     * @param sourceObject
     * @param destinationObject
     * @param <S>
     * @param <D>
     */
    <S, D> void map(S sourceObject, D destinationObject);

    /**
     * Collection of objects transformation
     *
     * @param source
     * @param destinationClass
     * @param <S>
     * @param <D>
     * @return
     */
    <S, D> List<D> mapAsList(Iterable<S> source, Class<D> destinationClass);
}

