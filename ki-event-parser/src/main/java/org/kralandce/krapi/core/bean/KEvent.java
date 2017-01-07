package org.kralandce.krapi.core.bean;

import org.kralandce.krapi.core.model.kraland.MKCity;
import org.kralandce.krapi.core.model.kraland.MKEvent;
import org.kralandce.krapi.core.model.kraland.MKNation;
import org.kralandce.krapi.core.model.kraland.MKProvince;

import java.util.Optional;

/**
 * @author Ricorei
 */
public interface KEvent {

    public Optional<MKNation.Name> getNation();

    public Optional<MKProvince.Name> getProvince();

    public Optional<MKCity.Name> getCity();

    public Optional<MKEvent.Type> getType();

    public Optional<MKEvent.Content> getContent();

    public Optional<MKEvent.Date> getDate();
}
