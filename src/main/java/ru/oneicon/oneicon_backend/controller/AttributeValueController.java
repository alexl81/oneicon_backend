package ru.oneicon.oneicon_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.AttributeValue;
import ru.oneicon.oneicon_backend.service.AttributeValueService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/attributeValue")
public class AttributeValueController {

    private final AttributeValueService attributeValueService;


    @Autowired
    public AttributeValueController(AttributeValueService attributeValueService) {
        this.attributeValueService = attributeValueService;
    }

    @GetMapping(path = "/all")
    public List<AttributeValue> getAllAttributeValues() {
        return attributeValueService.getAllAttributeValues();
    }

    @GetMapping(path="/{id}")
    public AttributeValue getAttributeValueById(@PathVariable("id") Long id) {
        return attributeValueService.getAttributeValueById(id);
    }

    @PostMapping
    public void createAttributeValue(@RequestBody AttributeValue attributeValue) {
        attributeValueService.addAttributeValue(attributeValue);
    }

    @PutMapping(path="/{id}")
    public AttributeValue editAttributeValue(@RequestBody AttributeValue attributeValue) {
        return attributeValueService.updateAttributeValue(attributeValue);
    }

    @DeleteMapping(path="/{id}")
    public void removeAttributeValue(@PathVariable("id") Long id) {
        attributeValueService.deleteAttributeValue(id);
    }


}
