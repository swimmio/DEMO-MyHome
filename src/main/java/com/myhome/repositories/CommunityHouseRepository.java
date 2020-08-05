/*
 * Copyright 2020 Prathab Murugan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.myhome.repositories;

import com.myhome.domain.CommunityHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityHouseRepository extends JpaRepository<CommunityHouse, Long> {

  CommunityHouse findByHouseId(String houseId);

  void deleteByHouseId(String houseId);
}
