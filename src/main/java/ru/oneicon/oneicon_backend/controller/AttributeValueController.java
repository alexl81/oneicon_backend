package ru.oneicon.oneicon_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.Attribute;
import ru.oneicon.oneicon_backend.entity.AttributeValue;
import ru.oneicon.oneicon_backend.service.AttributeService;
import ru.oneicon.oneicon_backend.service.AttributeValueService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/value")
public class AttributeValueController {

    private final AttributeValueService attributeValueService;
    private final AttributeService attributeService;


    @Autowired
    public AttributeValueController(AttributeValueService attributeValueService, AttributeService attributeService) {
        this.attributeValueService = attributeValueService;
        this.attributeService = attributeService;
    }

    @GetMapping(path = "/all")
    public List<AttributeValue> getAllAttributeValues() {
        return attributeValueService.getAllAttributeValues();
    }

    @GetMapping(path="/{id}")
    public AttributeValue getAttributeValueById(@PathVariable("id") Long id) {
        return attributeValueService.getAttributeValueById(id);
    }

    @PutMapping(path="/{id}")
    public AttributeValue editAttributeValue(@RequestBody AttributeValue attributeValue) {
        return attributeValueService.updateAttributeValue(attributeValue);
    }

}
