package ru.oneicon.oneicon_backend.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.Attribute;
import ru.oneicon.oneicon_backend.entity.AttributeValue;
import ru.oneicon.oneicon_backend.service.AttributeService;
import ru.oneicon.oneicon_backend.service.AttributeValueService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/attribute")
public class AttributeController {

    private final AttributeService attributeService;
    private final AttributeValueService attributeValueService;

    @Autowired
    public AttributeController(AttributeService attributeService, AttributeValueService attributeValueService) {
        this.attributeService = attributeService;
        this.attributeValueService = attributeValueService;
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

    @GetMapping(path = "{id}/values")
    public List<AttributeValue> getAttributeValuesByAttributeId(@PathVariable("id") Long attributeId) {
        Attribute attribute = attributeService.getAttributeById(attributeId);
        return attribute.getAttributeValueList().stream()
                .collect(Collectors.toList());
    }

    // adding AttributeValues
    @PostMapping(path="{id}/values")
    public void createAttributeValue(@PathVariable Long id, @RequestBody AttributeValue attributeValue) {
        Attribute attribute = attributeService.getAttributeById(id);
        attribute.addAttributeValue(attributeValue);
        attributeValueService.addAttributeValue(attributeValue);
    }

//    @PutMapping(path="{attributeId}/value/{valueId}")
//    public AttributeValue updateAttributeValue(@PathVariable("attributeId") Long attributeId,
//                                               @RequestBody AttributeValue attributeValue,
//                                               @PathVariable("valueId") Long valueId) {
//        Attribute attribute = attributeService.getAttributeById(attributeId);
//            attribute.addAttributeValue(attributeValue);
//         return attributeValueService.updateAttributeValue(attributeValueService.getAttributeValueById(valueId));
//    }

    //deleting AttributeValues
    @DeleteMapping(path = "{attributeId}/value/{valueId}")
    public void deleteAttributeValue(@PathVariable("attributeId") Long attributeId,
                                     @PathVariable("valueId") Long valueId) {
        Attribute attribute = attributeService.getAttributeById(attributeId);
        attribute.removeAttributeValue(attributeValueService.getAttributeValueById(valueId));
        attributeValueService.deleteAttributeValue(valueId);
    }
}
