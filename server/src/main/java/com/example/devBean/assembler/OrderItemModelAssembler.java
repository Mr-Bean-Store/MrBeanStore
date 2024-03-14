package com.example.devBean.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import com.example.devBean.controller.OrderItemController;
import com.example.devBean.model.OrderItem;

@Component
public class OrderItemModelAssembler implements RepresentationModelAssembler<OrderItem, EntityModel<OrderItem>> {
    
    @Override
    public EntityModel<OrderItem> toModel(OrderItem item) {
        return EntityModel.of(item,
            linkTo(methodOn(OrderItemController.class).oneOrderItem(item.getOrderItemId())).withSelfRel(),
            linkTo(methodOn(OrderItemController.class).allOrderItems()).withRel("orderItems"));
    }
}