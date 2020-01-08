package com.offcn.pay;

import org.springframework.stereotype.Service;

@Service
public class PayserviceImpl implements Payservice {
    @Override
    public void add(Double money) {
        System.out.println("添加成功");


    }

    @Override
    public void update(Double money) {
        System.out.println("修改成功");
    }

    @Override
    public void delete(Long id) {
        System.out.println("删除成功");
    }
}
