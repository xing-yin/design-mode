package com.beauty_design_mode.lecture43.demo2;

/**
 * 外部共享存储区(如 redis)
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public interface SharedObjectsStorage {

    IdGenerator load(Class<IdGenerator> idGeneratorClass);

    void save(IdGenerator idGenerator, Class<IdGenerator> idGeneratorClass);
}
