/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.scc.findings.v1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createNote options.
 */
public class CreateNoteOptions extends GenericModel {

  /**
   * This must be 1&amp;#58;1 with members of our oneofs, it can be used for filtering Note and Occurrence on their
   * kind.
   *  - FINDING&amp;#58; The note and occurrence represent a finding.
   *  - KPI&amp;#58; The note and occurrence represent a KPI value.
   *  - CARD&amp;#58; The note represents a card showing findings and related metric values.
   *  - CARD_CONFIGURED&amp;#58; The note represents a card configured for a user account.
   *  - SECTION&amp;#58; The note represents a section in a dashboard.
   */
  public interface Kind {
    /** FINDING. */
    String FINDING = "FINDING";
    /** KPI. */
    String KPI = "KPI";
    /** CARD. */
    String CARD = "CARD";
    /** CARD_CONFIGURED. */
    String CARD_CONFIGURED = "CARD_CONFIGURED";
    /** SECTION. */
    String SECTION = "SECTION";
  }

  protected String providerId;
  protected String shortDescription;
  protected String longDescription;
  protected String kind;
  protected String id;
  protected Reporter reportedBy;
  protected List<ApiNoteRelatedUrl> relatedUrl;
  protected Date expirationTime;
  protected Boolean shared;
  protected FindingType finding;
  protected KpiType kpi;
  protected Card card;
  protected Section section;
  protected String transactionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String providerId;
    private String shortDescription;
    private String longDescription;
    private String kind;
    private String id;
    private Reporter reportedBy;
    private List<ApiNoteRelatedUrl> relatedUrl;
    private Date expirationTime;
    private Boolean shared;
    private FindingType finding;
    private KpiType kpi;
    private Card card;
    private Section section;
    private String transactionId;

    private Builder(CreateNoteOptions createNoteOptions) {
      this.providerId = createNoteOptions.providerId;
      this.shortDescription = createNoteOptions.shortDescription;
      this.longDescription = createNoteOptions.longDescription;
      this.kind = createNoteOptions.kind;
      this.id = createNoteOptions.id;
      this.reportedBy = createNoteOptions.reportedBy;
      this.relatedUrl = createNoteOptions.relatedUrl;
      this.expirationTime = createNoteOptions.expirationTime;
      this.shared = createNoteOptions.shared;
      this.finding = createNoteOptions.finding;
      this.kpi = createNoteOptions.kpi;
      this.card = createNoteOptions.card;
      this.section = createNoteOptions.section;
      this.transactionId = createNoteOptions.transactionId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param providerId the providerId
     * @param shortDescription the shortDescription
     * @param longDescription the longDescription
     * @param kind the kind
     * @param id the id
     * @param reportedBy the reportedBy
     */
    public Builder(String providerId, String shortDescription, String longDescription, String kind, String id, Reporter reportedBy) {
      this.providerId = providerId;
      this.shortDescription = shortDescription;
      this.longDescription = longDescription;
      this.kind = kind;
      this.id = id;
      this.reportedBy = reportedBy;
    }

    /**
     * Builds a CreateNoteOptions.
     *
     * @return the new CreateNoteOptions instance
     */
    public CreateNoteOptions build() {
      return new CreateNoteOptions(this);
    }

    /**
     * Adds an relatedUrl to relatedUrl.
     *
     * @param relatedUrl the new relatedUrl
     * @return the CreateNoteOptions builder
     */
    public Builder addRelatedUrl(ApiNoteRelatedUrl relatedUrl) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relatedUrl,
        "relatedUrl cannot be null");
      if (this.relatedUrl == null) {
        this.relatedUrl = new ArrayList<ApiNoteRelatedUrl>();
      }
      this.relatedUrl.add(relatedUrl);
      return this;
    }

    /**
     * Set the providerId.
     *
     * @param providerId the providerId
     * @return the CreateNoteOptions builder
     */
    public Builder providerId(String providerId) {
      this.providerId = providerId;
      return this;
    }

    /**
     * Set the shortDescription.
     *
     * @param shortDescription the shortDescription
     * @return the CreateNoteOptions builder
     */
    public Builder shortDescription(String shortDescription) {
      this.shortDescription = shortDescription;
      return this;
    }

    /**
     * Set the longDescription.
     *
     * @param longDescription the longDescription
     * @return the CreateNoteOptions builder
     */
    public Builder longDescription(String longDescription) {
      this.longDescription = longDescription;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the CreateNoteOptions builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateNoteOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the reportedBy.
     *
     * @param reportedBy the reportedBy
     * @return the CreateNoteOptions builder
     */
    public Builder reportedBy(Reporter reportedBy) {
      this.reportedBy = reportedBy;
      return this;
    }

    /**
     * Set the relatedUrl.
     * Existing relatedUrl will be replaced.
     *
     * @param relatedUrl the relatedUrl
     * @return the CreateNoteOptions builder
     */
    public Builder relatedUrl(List<ApiNoteRelatedUrl> relatedUrl) {
      this.relatedUrl = relatedUrl;
      return this;
    }

    /**
     * Set the expirationTime.
     *
     * @param expirationTime the expirationTime
     * @return the CreateNoteOptions builder
     */
    public Builder expirationTime(Date expirationTime) {
      this.expirationTime = expirationTime;
      return this;
    }

    /**
     * Set the shared.
     *
     * @param shared the shared
     * @return the CreateNoteOptions builder
     */
    public Builder shared(Boolean shared) {
      this.shared = shared;
      return this;
    }

    /**
     * Set the finding.
     *
     * @param finding the finding
     * @return the CreateNoteOptions builder
     */
    public Builder finding(FindingType finding) {
      this.finding = finding;
      return this;
    }

    /**
     * Set the kpi.
     *
     * @param kpi the kpi
     * @return the CreateNoteOptions builder
     */
    public Builder kpi(KpiType kpi) {
      this.kpi = kpi;
      return this;
    }

    /**
     * Set the card.
     *
     * @param card the card
     * @return the CreateNoteOptions builder
     */
    public Builder card(Card card) {
      this.card = card;
      return this;
    }

    /**
     * Set the section.
     *
     * @param section the section
     * @return the CreateNoteOptions builder
     */
    public Builder section(Section section) {
      this.section = section;
      return this;
    }

    /**
     * Set the transactionId.
     *
     * @param transactionId the transactionId
     * @return the CreateNoteOptions builder
     */
    public Builder transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    /**
     * Set the apiNote.
     *
     * @param apiNote the apiNote
     * @return the CreateNoteOptions builder
     */
    public Builder apiNote(ApiNote apiNote) {
      this.shortDescription = apiNote.shortDescription();
      this.longDescription = apiNote.longDescription();
      this.kind = apiNote.kind();
      this.id = apiNote.id();
      this.reportedBy = apiNote.reportedBy();
      this.relatedUrl = apiNote.relatedUrl();
      this.expirationTime = apiNote.expirationTime();
      this.shared = apiNote.shared();
      this.finding = apiNote.finding();
      this.kpi = apiNote.kpi();
      this.card = apiNote.card();
      this.section = apiNote.section();
      return this;
    }
  }

  protected CreateNoteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.providerId,
      "providerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.shortDescription,
      "shortDescription cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.longDescription,
      "longDescription cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.kind,
      "kind cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.reportedBy,
      "reportedBy cannot be null");
    providerId = builder.providerId;
    shortDescription = builder.shortDescription;
    longDescription = builder.longDescription;
    kind = builder.kind;
    id = builder.id;
    reportedBy = builder.reportedBy;
    relatedUrl = builder.relatedUrl;
    expirationTime = builder.expirationTime;
    shared = builder.shared;
    finding = builder.finding;
    kpi = builder.kpi;
    card = builder.card;
    section = builder.section;
    transactionId = builder.transactionId;
  }

  /**
   * New builder.
   *
   * @return a CreateNoteOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the providerId.
   *
   * Part of `parent`. This field contains the provider_id for example: providers/{provider_id}.
   *
   * @return the providerId
   */
  public String providerId() {
    return providerId;
  }

  /**
   * Gets the shortDescription.
   *
   * A one sentence description of this `Note`.
   *
   * @return the shortDescription
   */
  public String shortDescription() {
    return shortDescription;
  }

  /**
   * Gets the longDescription.
   *
   * A detailed description of this `Note`.
   *
   * @return the longDescription
   */
  public String longDescription() {
    return longDescription;
  }

  /**
   * Gets the kind.
   *
   * This must be 1&amp;#58;1 with members of our oneofs, it can be used for filtering Note and Occurrence on their
   * kind.
   *  - FINDING&amp;#58; The note and occurrence represent a finding.
   *  - KPI&amp;#58; The note and occurrence represent a KPI value.
   *  - CARD&amp;#58; The note represents a card showing findings and related metric values.
   *  - CARD_CONFIGURED&amp;#58; The note represents a card configured for a user account.
   *  - SECTION&amp;#58; The note represents a section in a dashboard.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the id.
   *
   * The id of the note.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the reportedBy.
   *
   * The entity reporting a note.
   *
   * @return the reportedBy
   */
  public Reporter reportedBy() {
    return reportedBy;
  }

  /**
   * Gets the relatedUrl.
   *
   * URLs associated with this note.
   *
   * @return the relatedUrl
   */
  public List<ApiNoteRelatedUrl> relatedUrl() {
    return relatedUrl;
  }

  /**
   * Gets the expirationTime.
   *
   * Time of expiration for this note, null if note does not expire.
   *
   * @return the expirationTime
   */
  public Date expirationTime() {
    return expirationTime;
  }

  /**
   * Gets the shared.
   *
   * True if this `Note` can be shared by multiple accounts.
   *
   * @return the shared
   */
  public Boolean shared() {
    return shared;
  }

  /**
   * Gets the finding.
   *
   * FindingType provides details about a finding note.
   *
   * @return the finding
   */
  public FindingType finding() {
    return finding;
  }

  /**
   * Gets the kpi.
   *
   * KpiType provides details about a KPI note.
   *
   * @return the kpi
   */
  public KpiType kpi() {
    return kpi;
  }

  /**
   * Gets the card.
   *
   * Card provides details about a card kind of note.
   *
   * @return the card
   */
  public Card card() {
    return card;
  }

  /**
   * Gets the section.
   *
   * Card provides details about a card kind of note.
   *
   * @return the section
   */
  public Section section() {
    return section;
  }

  /**
   * Gets the transactionId.
   *
   * The transaction id for the request in uuid v4 format.
   *
   * @return the transactionId
   */
  public String transactionId() {
    return transactionId;
  }
}

