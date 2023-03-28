package org.oleg.demo.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class PageResponse<T> {
    private final Collection<T> data;
    private final long total;
    private final int pageSize;
    private final int pageNumber;


    public PageResponse(Page<T> page) {
        this(page.getContent(), page.getTotalElements(), page.getSize(), page.getNumber());
    }

    public PageResponse(PageResponse<?> page, Collection<T> data){
        this(data, page.getTotal(), page.getPageSize(), page.getPageNumber());
    }

    public <T> PageResponse<T> toPageResponse(Collection<T> list) {
        return new PageResponse<>(this, list);
    }
}
