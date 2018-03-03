package lissa.utiles;
//aki van todas las constantes

public class Common {

    // 
    public static int id_seguro_fondo_prevision = 4;
    public static String var_gloval_igv = "IGV";
    public static String var_gloval_serial_i1 = "SERIAL-I1";
    
    
    // tipo de documento de pago
    public static int tipo_doc_pago_factura = 1;
    public static int tipo_doc_pago_boleta = 2;
    public static int tipo_doc_pago_recibo = 3;
    public static int tipo_doc_pago_proforma = 4;
    public static int tipo_doc_pago_fondo_prev = 5;

    // estado subvencionado
    public static int si_subencionado = 1;
    public static int no_subencionado = 0;
    
    // constante de uso para mostrar el uso de un horario en la ventana boleta
    public static String est_esqma_en_uso = "EN USO";

    // estado de las consumos de los servicios
    public static String est_item_bol_activo = "ACTIVO";
    public static String est_item_bol_pendi = "PENDIENTE";
    public static String est_item_bol_terminado = "TERMINADO";
    public static String est_item_bol_anulado = "ANULADO";

    // estados de las boletas
    public static String est_bol_pagado = "PAGADO";
    public static String est_bolet_pen_pago = "PENDIENTE DE PAGO";
    public static String est_bol_anulado = "ANULADO";

    // tipo de medico
    public static String tipo_medico_planta = "MEDICO DE PLANTA";
    public static String tipo_medico_externo = "MEDICO EXTERNO";
    public static String tipo_medico_llamadas = "MEDICO DE LLAMADAS";

    // tipo de controles
    public static String control_abilitar = "ABILITAR CONTROLES";
    public static String control_desabilitar = "DESABILITAR CONTROLES";

    // tipos de Persona
    public static String tipo_persona_natural = "PERSONA NATURAL";
    public static String tipo_persona_juridica = "PERSONA JURIDICA";

    //datos del log de succesos
    public static String nombre_archivo_log = "Log";

    //mensajes de UI
    public static String item_selec_combo = "Seleccione";
    public static String abilitar_receptores = "Modificar";
    public static String generar_reporte = "Reporte";
    public static String item_reevaluacion_combo = "Reevaluar";
    public static String abilitar_y_limpiar_receptores = "Nuevo";
    public static String desabilitar_y_limpiar_receptores = "Cancelar";
    public static String item_historiaclinica_combo = "Historia Clinica";
    public static String item_fondoprevicion_combo = "Fondo de Prevision";
    public static String desabilitar_receptores = "Terminar Operacion";
    public static String item_cerrar = "Cerrar";
    public static String activar_boleta = "Activar Boleta";
    public static String anular_boleta = "Anular Boleta";

    //constantes para la base de datos
    public static int error_coneccion_db = 1;
    public static int error_ejecucion_sentencia = 2;
    public static int error_cierre_db = 3;
    public static int sentencia_exitosa = 0;

    //Estos son los roles de la institucion
    public static String rol_director = "Director";
    public static String rol_docente = "Docente";
    public static String rol_secretaria = "Secretaria";

    //Tipo de busqueda
    public static int seleccione_opcion = 0;
    public static int busqueda_nombre = 1;
    public static int busqueda_dni = 2;
    public static int busqueda_cargo = 3;

    //mensajes de confirmacion
    public static String mensaje_registro_exitoso = "Los Datos fueron registrados correctamente...";

    //indicadores de select
    public static int c_numCero = 0;
    public static int c_numUno = 1;
    public static int c_numDos = 2;
    public static int c_numTres = 3;
    public static int c_numCuatro = 4;
    public static int c_numCinco = 5;
    public static int c_numSeis = 6;
    public static int c_numSiete = 7;
    public static int c_numOcho = 8;
    public static int c_numNueve = 9;
    public static int c_numDiez = 10;
    public static int c_numOnce = 11;
    public static int c_numDoce = 12;
    public static int c_numTrece = 13;
    public static int c_numCatorce = 14;

    public static String c_caraTres = "3";
    //ID de contenedor
    public static int c_unico = 5;
    public static int c_adicional = 6;
    //ID Tabla
    public static int c_tipoSexo = 1;
    //otros
    //public static String c_pathReporte = "C:\\SIEC\\Reporte\\";
    public static String c_pathReporte = "Reporte\\";

    //public static String c_pathConfiguracion = "C:\\SIEC\\Config\\configuracion.txt";
    public static String c_pathConfiguracion = "Config\\configuracion.txt";

    //public static String c_pathConfiguracion = "Config/configuracion.txt";
    public static String msje_Validacion_Controles = "Los Datos que tienen * son de caracter obligatorio.";
    //Ultimo numero de certificado emitido en el anterior sistema
    public static int c_numUltimoCertificado = 0;
    //tipos de escuela (idContenedor)
    public static int c_tipoPregrado = 8;
    public static int c_tipoPostgrado = 9;
    public static int c_tipoCecu = 10;
    public static String c_tipoCecuAyacucho = "61";
    //curso y semestre
    public static int c_indCurso = 1;
    public static int c_indSemestre = 2;
    public static String c_indMaestria = "70";
    public static String c_indCecu = "6";
    //validacion de ingreso de tipo de usuario
    public static int c_tipoAdministrador = 1;
    public static int c_tipoDigitador = 2;
    //Domicilio Fiscal validacion de Foraneo
    public static String msje_validacionForaneoDepartamento = "Debe seleccionar otro Departamento";
    public static String msje_validadcionForaneoProvincia = "Debe escoger una Provincia";
    public static String msje_validacionForaneoDistrito = "Debe seleccionar un Distrito";
    public static String mensaje_cancelar = "¿Esta seguro de Cancelar esta Operación?";
    public static String mensaje_campos_vacios = "uno o mas campos estan vacios";
}
