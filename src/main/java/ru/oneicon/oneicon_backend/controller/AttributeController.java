package ru.oneicon.oneicon_backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.Attribute;
import ru.oneicon.oneicon_backend.entity.AttributeValue;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ProductAttribute;
import ru.oneicon.oneicon_backend.service.AttributeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/attribute")
public class AttributeController {

    private final AttributeService attributeService;

    @Autowired
    public AttributeController(AttributeService attributeService) {
        this.attributeService = attributeService;
    }


    @GetMapping(path = "/all")
    public List<Attribute> getAllAttributes() {
        return attributeService.getAllAttributes();
    }

    @GetMapping(path="/{id}")
    public Attribute getAttributeById(@PathVariable("id") Long id) {
        return attributeService.getAttributeById(id);
    }

    @PostMapping
    public void createAttribute(@RequestBody Attribute attribute) {
        attributeService.addAttribute(attribute);
    }

    @PutMapping(path="/{id}")
    public Attribute editAttribute(@RequestBody Attribute attribute) {
        return attributeService.updateAttribute(attribute);
    }

    @DeleteMapping(path="/{id}")
    public void removeAttribute(@PathVariable("id") Long id) {
        attributeService.deleteAttribute(id);
    }

    @GetMapping(path = "{id}/attributeValues")
    public List<AttributeValue> getAttributeValuesByAttributeId(@PathVariable("id") Long attributeId) {
        Attribute attribute = attributeService.getAttributeById(attributeId);
        return attribute.getAttributeValueList().stream()
                .collect(Collectors.toList());
    }
}
