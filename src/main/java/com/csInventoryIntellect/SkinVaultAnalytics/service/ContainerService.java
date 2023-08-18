package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Container;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Key;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.ContainerRepository;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContainerService {

    @Autowired
    private ContainerRepository containerRepository;

    @Autowired
    private  KeyRepository keyRepository;

    public String createContainers(List<Container> containers) {

        containerRepository.saveAll(containers);

        for (Container container : containers) {

            if (container.getKey() != null) {

                /*
                try{
                    Optional<Key> keyFromDB = keyRepository.searchByKeyName(container.getKey());
                    if (keyFromDB.isPresent()){
                        container.setKey(keyFromDB.get());
                        keyRepository.save(container.getKey());
                    } else {
                        keyRepository.save(container.getKey());
                    }
                } catch (Exception e){
                    return e.toString();
                }
                 */
                keyRepository.save(container.getKey());
            }
        }

        return "Added all Containers and their keys (if existing) successfully!";
    }

    public List<Container> getAllContainers() {
        return containerRepository.findAll();
    }
}
