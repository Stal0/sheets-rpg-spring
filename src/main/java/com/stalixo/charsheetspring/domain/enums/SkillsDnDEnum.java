package com.stalixo.charsheetspring.domain.enums;

public enum SkillsDnDEnum {

    ATHLETICS(AttributesDndEnum.STRENGTH),
    ACROBATICS(AttributesDndEnum.DEXTERITY),
    STEALTH(AttributesDndEnum.DEXTERITY),
    SLEIGHT_OF_HAND(AttributesDndEnum.DEXTERITY),
    ARCANA(AttributesDndEnum.INTELLIGENCE),
    HISTORY(AttributesDndEnum.INTELLIGENCE),
    INVESTIGATION(AttributesDndEnum.INTELLIGENCE),
    NATURE(AttributesDndEnum.INTELLIGENCE),
    RELIGION(AttributesDndEnum.INTELLIGENCE),
    ANIMAL_HANDLING(AttributesDndEnum.WISDOM),
    INSIGHT(AttributesDndEnum.WISDOM),
    MEDICINE(AttributesDndEnum.WISDOM),
    PERCEPTION(AttributesDndEnum.WISDOM),
    SURVIVAL(AttributesDndEnum.WISDOM),
    PERFORMANCE(AttributesDndEnum.CHARISMA),
    DECEPTION(AttributesDndEnum.CHARISMA),
    INTIMIDATION(AttributesDndEnum.CHARISMA),
    PERSUASION(AttributesDndEnum.CHARISMA);

    private final AttributesDndEnum atributoAssociado;

    SkillsDnDEnum(AttributesDndEnum atributoAssociado) {
        this.atributoAssociado = atributoAssociado;
    }

    public AttributesDndEnum getAtributoAssociado() {
        return atributoAssociado;
    }

}
