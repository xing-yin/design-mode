package lecture81_82_83.google.guava;

import com.google.common.collect.ForwardingCollection;

import java.util.Collection;

/**
 * Wrapper 模式
 *
 * @author Alan Yin
 * @date 2020/10/20
 */
public class AddLoggingCollection<E> extends ForwardingCollection<E> {

    private Collection<E> originalCollection;

    public AddLoggingCollection(Collection<E> originalCollection) {
        this.originalCollection = originalCollection;
    }

    @Override
    protected Collection<E> delegate() {
        return this.originalCollection;
    }

    @Override
    public boolean add(E element) {
//         // 增强的代码
//        log.info("Add element:" + element);
        return this.delegate().add(element);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        // 包装的代码
        // log.info("size of elements to add:" + collection.size());
        return this.delegate().addAll(collection);
    }
}
