package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Attribute;
import ru.oneicon.oneicon_backend.exception.BadRequestException;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.repository.AttributeRepository;

import java.util.List;

@Service
@Slf4j
public class AttributeService {

    private final AttributeRepository attributeRepository;

    @Autowired
    public AttributeService(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    public List<Attribute> getAllAttributes() {
        log.info("getAllAttributes was called");
        return attributeRepository.findAll();
    }

    public Attribute getAttributeById(Long id) {
        log.info("getAttributeById was called");
        return attributeRepository.findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Attribute with id " + id + " was not found");
                    log.error("error in getting attribute {}", id, notFoundException);
                    return notFoundException;
                });
    }

    public void addAttribute(Attribute attribute) {
        log.info("addAttribute was called");
        if(attribute.getName() == null)
            throw new BadRequestException("Attribute name must not be empty");
        attributeRepository.save(attribute);
    }

    public Attribute updateAttribute(Attribute attribute) {
        log.info("updateAttribute was called");
        return attributeRepository.save(attribute);
    }

    public void deleteAttribute(Long id) {
        log.info("deleteAttribute was called");
        if(!attributeRepository.existsById(id)) {
            throw new NotFoundException("Attribute with id " + id + " does not exists");
        }
        attributeRepository.deleteById(id);
    }
}
