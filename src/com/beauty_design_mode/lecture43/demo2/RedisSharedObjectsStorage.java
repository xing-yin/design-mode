package com.beauty_design_mode.lecture43.demo2;

/**
 * @author Alan Yin
 * @date 2021/1/17
 */

public class RedisSharedObjectsStorage implements SharedObjectsStorage {
    @Override
    public IdGenerator load(Class<IdGenerator> idGeneratorClass) {
        return null;
    }

    @Override
    public void save(IdGenerator idGenerator, Class<IdGenerator> idGeneratorClass) {

    }
}
