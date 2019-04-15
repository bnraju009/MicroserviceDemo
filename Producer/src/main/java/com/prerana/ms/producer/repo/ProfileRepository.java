package com.prerana.ms.producer.repo;

import java.util.List;

import com.prerana.ms.producer.model.Profile;

public interface ProfileRepository {
    List<Profile> getAllProfiles();

    Profile getProfile(String userId);
}