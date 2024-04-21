package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Resources;
import pl.edu.vistula.s61988.repository.ResourcesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourcesService {

    private final ResourcesRepository zasobyRepository;

    public List<Resources> getAllResources() {
        return zasobyRepository.findAll();
    }
}
