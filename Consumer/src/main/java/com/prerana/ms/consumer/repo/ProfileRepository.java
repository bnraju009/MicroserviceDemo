package com.prerana.ms.consumer.repo;

import java.util.List;

import com.prerana.ms.consumer.model.Profile;

public interface ProfileRepository {
    List<Profile> getAllProfiles();

    Profile getProfile(String userId);
}